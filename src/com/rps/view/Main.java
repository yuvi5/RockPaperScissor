package com.rps.view;

import com.rps.model.RPSModel;

public class Main {
	public static void main(String[] args){

        RPSModel model = new RPSModel();

        String choice = model.getComInput();

        System.out.println(choice);

    }
}
