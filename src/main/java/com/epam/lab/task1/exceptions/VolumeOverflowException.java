package com.epam.lab.task1.exceptions;

public class VolumeOverflowException extends Exception {

  public VolumeOverflowException() {
  }

  public VolumeOverflowException(String message) {
    super(message);
  }

  public VolumeOverflowException(String message, Throwable cause) {
    super(message, cause);
  }

  public VolumeOverflowException(Throwable cause){
    super(cause);
  }
}
