package com.yeamanan.projecttwo.view;

/**
 * ViewType enum.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public enum ViewType {

    /**
     * Language selection view.
     */
    LanguageSelectionView(new LanguageSelectionViewFactory()),

    /**
     * Main view.
     */
    MainView(new MainViewFactory()),

    /**
     * Mission selection view.
     */
    MissionSelectionView(new MissionSelectionViewFactory()),

    /**
     * Survivor selection view.
     */
    SurvivorSelectionView(new SurvivorSelectionViewFactory());

    /**
     * View factory.
     */
    private final ViewFactory factory;

    /**
     * Constructor.
     *
     * @param argFactory the factory of the type of view
     */
    private ViewType(final ViewFactory argFactory) {
        this.factory = argFactory;
    }

    /**
     * getFactory() method.
     *
     * @return the factory of the type of view
     */
    public ViewFactory getFactory() {
        return this.factory;
    }

}
