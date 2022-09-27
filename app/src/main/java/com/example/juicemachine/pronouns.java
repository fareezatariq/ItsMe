package com.example.juicemachine;

import java.util.ArrayList;
import java.util.List;

public class pronouns {
    List <String> Pronoun(String title){
        List <String> nouns = new ArrayList<>();
        if (title.equals("Mr")){
            nouns.add("He");
            nouns.add("Him");
        }else{
            nouns.add("She");
            nouns.add("Her");
        }
        return nouns;
    }
}
