public class TV {
  
  private int channel;
  private int volume;
  private boolean on;
  
  public TV(){
    channel = 1;
    volume = 1;
    on = false;
  }
  
  public void turnOn(){on = true;}
  public void turnOff(){on = false;}
  
  public void setChannel(int c){if(on && c <= 120 && c >= 1){channel = c;}}
  public void setVolume(int v){if(on && v <= 7 && v >= 1){volume = v;}}
  
  public void channelUp(){if(on && channel < 120){channel++;}}
  public void channelDown(){if(on && channel > 1){channel--;}}
  
  public void volumeUp(){if(on && volume < 7){volume++;}}
  public void volumeDown(){if(on && volume > 1){volume--;}}
  
  public String toString(){
   String r;
   
   if(on) r = "Power : on";
   else r = "Power : off";
   
   return r + String.format("\nChannel : %d\nVolume : %d\n", channel, volume);
  }
}
