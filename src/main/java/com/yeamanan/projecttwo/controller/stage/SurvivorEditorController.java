package com.yeamanan.projecttwo.controller.stage;

import com.yeamanan.projecttwo.model.Skill;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.service.character.SurvivorService;
import com.yeamanan.projecttwo.service.character.SurvivorServiceImpl;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import org.apache.log4j.Logger;

/**
 * SurvivorEditorController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorEditorController implements Initializable {

    /**
     * Log.
     */
    private static final Logger LOG =
           Logger.getLogger(SurvivorEditorController.class);

    /**
     * Survivors available.
     */
    private transient List<Survivor> survivors;

    /**
     * A choice box.
     */
    @FXML
    protected ChoiceBox cbSurvivors;

    /**
     * Text field of the name.
     */
    @FXML
    protected TextField tfName;

    /**
     * Tree view of skills.
     */
    @FXML
    protected TreeView tvSkills;

    /**
     * Tree items of skills.
     */
    @FXML
    protected TreeItem tiSkills;

    /**
     * Tree view of the selected skills
     */
    @FXML
    protected TreeView tvSelectedSkills;

    /**
     * Tree items of selected skills.
     */
    @FXML
    protected TreeItem tiSelectedSkills;

    /**
     * Change listener of the survivor choice box.
     */
    private ChangeListener<String> changeListener =
        new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                    String oldValue, String newValue) {
                final int index = survivors.indexOf(new Survivor(newValue));
                final Survivor survivor = survivors.get(index);
                tfName.setText(survivor.getName());
            }
        };

    /**
     * initialize() method.
     *
     * @param url an url
     * @param rb a resource bundle
     */
    @Override
    public final void initialize(final URL url, final ResourceBundle rb) {
        final SurvivorService sService = new SurvivorServiceImpl();
        survivors = sService.loadAll();
        for (Survivor survivor : survivors) {
            cbSurvivors.getItems().add(survivor.getName());
        }
        cbSurvivors.valueProperty().addListener(changeListener);

        for (int i = 1; i < Skill.values().length; i++) {
            TreeItem<String> tiSkill =
                    new TreeItem<> (Skill.values()[i].name());
            tiSkills.getChildren().add(tiSkill);
        }
    }

    /**
     * handleDragDetectedAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleDragDetectedAction(final MouseEvent event) {
        TreeView source = (TreeView) event.getSource();
        TreeItem<String> item = (TreeItem<String>) source.getSelectionModel().getSelectedItem();
        if (item != null) {
            Dragboard db = source.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(item.getValue());
            db.setContent(content);
        }
        event.consume();
        LOG.info("Drag detected");
    }

    /**
     * handleDragOverAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleDragOverAction(final DragEvent event) {
        final TreeView target = (TreeView) event.getSource();
        if (event.getGestureSource() != target
                && event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }
        event.consume();
        LOG.info("Drag hover");
    }

    /**
     * handleDragDroppedAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleDragDroppedAction(final DragEvent event) {
        final TreeView target = (TreeView) event.getSource();
        final Dragboard db = event.getDragboard();
        boolean success = false;
        if (db.hasString()) {
            final TreeItem<String> tmp = new TreeItem<>(db.getString());
            target.getRoot().getChildren().add(tmp);
            success = true;
        }
        event.setDropCompleted(success);
        event.consume();
        LOG.info("Drag dropped");
    }

}
