class SignalQuestion {

    String question;
    String elaboration;
    String[] responseQuestions;

    String chosenResponse;

    SignalQuestion(){

        question = "default question";
        elaboration = "default elaboration";
        responseQuestions = new String[]{};

        chosenResponse = "none";

    }

    SignalQuestion(String q, String e, String[] rQ){

        question = q;
        elaboration = e;
        responseQuestions = rQ;

        chosenResponse = "none";

    }

}
