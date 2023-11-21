package controller;

import java.util.ArrayList;
import java.util.Map;

import database.DataBase;
import logic.Automaton;


public class Controller {
    public static boolean recognizeAutomate(ArrayList<String> states, ArrayList<String> alphabet,
     Map<String, Map<String, String>> functions, String startingState, ArrayList<String> endingStates,
      ArrayList<String> language){

        Automaton automaton = new Automaton(states, alphabet, functions, startingState, endingStates);

        return automaton.recognize(language);
    }

    public static String saveAutomate(ArrayList<String> states, ArrayList<String> alphabet,
     Map<String, Map<String, String>> functions, String startingState, ArrayList<String> endingStates, String automateName){

        Automaton automaton = new Automaton(states, alphabet, functions, startingState, endingStates);
        return DataBase.saveAutomate(automateName, automaton);
    }

    public static String deleteAutomate(String automateName){
        return DataBase.removeAutomate(automateName);
    }

    public static ArrayList<ArrayList<String>> getAutomatesNames(){
        return DataBase.getAutomates();
    }
}
