package testapp;

/**
 *
 * @author MVC
 */
public class TV {
    
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // TV is off;
    
    // constructor
    public TV(){
    }
    // Turn TV On
    public void turnOn(){
        on = true;
    }
    //Turn TV Off
    public void turnOff(){
        on = false;
    }
    //set a new channel
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    //set a new volume
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        }
    }
    // increase channel
    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }
    // decrease channel
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    } 
    // increase volume
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }
    // increase channel
    public void volumeDown(){
        if(on && volumeLevel > 1){
            volumeLevel--;
        }
    }
}
