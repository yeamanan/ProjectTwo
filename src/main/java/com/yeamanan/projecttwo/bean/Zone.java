package com.yeamanan.projecttwo.bean;

import com.yeamanan.projecttwo.bean.people.Character;
import java.util.ArrayList;
import java.util.List;

/**
 * Zone class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Zone {

    private List<Token> tokens;

    private List<Character> miniatures;

    public Zone() {
        this.tokens = new ArrayList<Token>();
        this.miniatures = new ArrayList<Character>();
    }

    public List<Token> getTokens() {
        return this.tokens;
    }

    public void setToken(final List<Token> argTokens) {
        this.tokens = argTokens;
    }

    public List<Character> getMiniatures() {
        return this.miniatures;
    }

    public void setMiniatures(List<Character> argMiniatures) {
        this.miniatures = argMiniatures;
    }

}
