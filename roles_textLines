private String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder new_play = new StringBuilder();
    String a = new String();
    for(int i=0; i < roles.length; i++){
            new_play = new_play.append(roles[i] + ":\n");

            for(int k=0 ; k < textLines.length; k++){

                if(textLines[k].startsWith(roles[i] + ':')){
                    new_play = new_play.append( (k+1) + ")" + textLines[k].substring(roles[i].length()+1) + "\n");
                }
            }
            new_play = new_play.append("\n");
        }
    return a + new_play;
}
