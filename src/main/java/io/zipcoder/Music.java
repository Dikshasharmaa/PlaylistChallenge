package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int backwardCount = 0;
        int forwardCounter =0;

        for (int j =startIndex; j < playList.length; j++){

            if(playList[j] == selection){
                break;
            }
            else
            {
               forwardCounter++;
            }
        }
        for (int i = startIndex; i > startIndex - playList.length; i--) {
            int index;
            if(i<0){
                index = playList.length + i;
            }
            else {
                index =i;
            }
            // System.out.println("Index value is "+index); // for debbuging the code
            if (playList[index] == selection) {
                break;
            }
            else{
                backwardCount++;
            }
        }

        if(forwardCounter < backwardCount){
            return forwardCounter;
        }
        else
            return backwardCount;
    }
}


