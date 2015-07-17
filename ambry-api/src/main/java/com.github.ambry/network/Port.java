package com.github.ambry.network;

/**
 * Used to represent a port containing port number and {@PortType}
 */
public class Port {
  int portNo;
  PortType type;

  public Port(int port, PortType type) {
    this.portNo = port;
    this.type = type;
  }

  public int getPortNo() {
    return this.portNo;
  }

  public PortType getPortType() {
    return this.type;
  }

  @Override
  public String toString() {
    return "Ports[" + getPortNo() + ":" + getPortType() + "]";
  }
}
