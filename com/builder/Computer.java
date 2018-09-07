//Important the computer class

import com.builder.Computer;


public class Computer{

  //required params.
  private String ram;

  private String hdd;

//optionals params
private boolean isGraphicsCardEnable;
private boolean isBluetoothEnabled;

public String getRam(){
  return this.ram;
}

public String getHdd(){
  return this.hdd;
}


public boolean isGraphicsCardEnable(){
  return isGraphicsCardEnable;
}

public boolean isBluetoothEnabled(){
  return isBluetoothEnabled;
}

// Note the private visibility of the constructor, and the builder variable type.

private Computer(ComputerBuilder builder){

  this.ram = builder.ram;
  this.hdd = builder.hdd;
  
  this.isGraphicsCardEnable= builder.isGraphicsCardEnable;
  this.isBluetoothEnabled= builder.isBluetoothEnabled;

}


//the builder inner class

public static class ComputerBuilder{
  //required params.
  private String ram;

  private String hdd;

//optionals params
private boolean isGraphicsCardEnable;
private boolean isBluetoothEnabled;


public ComputerBuilder(String hdd, String ram){
  this.ram = ram;
  this.hdd = hdd;
}

public ComputerBuilder setGraphicsCardEnabled(boolean val){
  this.isGraphicsCardEnable = val;
  return this;
}

public ComputerBuilder setBluetoothEnabled(boolean val){
  this.isBluetoothEnabled = val;

  return this;
}

  // The build function.
  public Computer build(){
    return new Computer(this);
  }
}

}
