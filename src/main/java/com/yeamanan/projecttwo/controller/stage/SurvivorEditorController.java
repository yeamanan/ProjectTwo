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
    private transient ChoiceBox cbSurvivors;

    /**
     * Text field of the name.
     */
    @FXML
    private transient TextField tfName;

    /**
     * Tree view of skills.
     */
//    @FXML
//    private transient TreeView tvSkills;

    /**
     * Tree items of skills.
     */
    @FXML
    private transient TreeItem tiSkills;

    /**
     * Tree view of the selected skills.
     */
//    @FXML
//    private transient TreeView tvSelectedSkills;

    /**
     * Tree items of selected skills.
     */
//    @FXML
//    private transient TreeItem tiSelectedSkills;

    /**
     * Change listener of the survivor choice box.
     */
    private final transient ChangeListener<String> changeListener =
        new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> obs,
                    final String oldValue, final String newValue) {
                final int index = survivors.indexOf(new Survivor(newValue));
                final Survivor survivor = survivors.get(index);
                tfName.setText(survivor.getName());
            }
        };

    /**
     * initialize() method.
     *
     * @param argUrl an url
     * @param argBundle a resource bundle
     */
    @Override
    public final void initialize(final URL argUrl,
            final ResourceBundle argBundle) {
        final SurvivorService sService = new SurvivorServiceImpl();
        survivors = sService.loadAll();
        for (Survivor survivor : survivors) {
            cbSurvivors.getItems().add(survivor.getName());
        }
        cbSurvivors.valueProperty().addListener(changeListener);

        for (int i = 1; i < Skill.values().length; i++) {
            final TreeItem<String> tiSkill =
                    new TreeItem(Skill.values()[i].name());
            tiSkills.getChildren().add(tiSkill);
        }
    }

    /**
     * handleDragDetectedAction() method.
     *
     * @param argEvent the event handled
     */
    @FXML
    protected final void handleDragDetectedAction(final MouseEvent argEvent) {
        final TreeView source = (TreeView) argEvent.getSource();
        final TreeItem<String> item =
                (TreeItem<String>) source.getSelectionModel().getSelectedItem();
        if (item != null) {
            final Dragboard board = source.startDragAndDrop(TransferMode.ANY);
            final ClipboardContent content = new ClipboardContent();
            content.putString(item.getValue());
            board.setContent(content);
        }
        argEvent.consume();
        LOG.info("Drag detected");
    }

    /**
     * handleDragOverAction() method.
     *
     * @param argEvent the event handled
     */
    @FXML
    protected final void handleDragOverAction(final DragEvent argEvent) {
        final TreeView target = (TreeView) argEvent.getSource();
        if (argEvent.getGestureSource() != target
                && argEvent.getDragboard().hasString()) {
            argEvent.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }
        argEvent.consume();
        LOG.info("Drag hover");
    }

    /**
     * handleDragDroppedAction() method.
     *
     * @param argEvent the event handled
     */
    @FXML
    protected final void handleDragDroppedAction(final DragEvent argEvent) {
        final Dragboard board = argEvent.getDragboard();
        boolean success = false;
        if (board.hasString()) {
            final TreeView target = (TreeView) argEvent.getSource();
            final TreeItem<String> tmp = new TreeItem(board.getString());
            target.getRoot().getChildren().add(tmp);
            success = true;
        }
        argEvent.setDropCompleted(success);
        argEvent.consume();
        LOG.info("Drag dropped");
    }

}
