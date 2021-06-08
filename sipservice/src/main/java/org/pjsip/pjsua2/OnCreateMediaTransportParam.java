/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCreateMediaTransportParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCreateMediaTransportParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCreateMediaTransportParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnCreateMediaTransportParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMediaIdx(long value) {
    pjsua2JNI.OnCreateMediaTransportParam_mediaIdx_set(swigCPtr, this, value);
  }

  public long getMediaIdx() {
    return pjsua2JNI.OnCreateMediaTransportParam_mediaIdx_get(swigCPtr, this);
  }

  public void setMediaTp(SWIGTYPE_p_void value) {
    pjsua2JNI.OnCreateMediaTransportParam_mediaTp_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getMediaTp() {
    long cPtr = pjsua2JNI.OnCreateMediaTransportParam_mediaTp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFlags(long value) {
    pjsua2JNI.OnCreateMediaTransportParam_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return pjsua2JNI.OnCreateMediaTransportParam_flags_get(swigCPtr, this);
  }

  public OnCreateMediaTransportParam() {
    this(pjsua2JNI.new_OnCreateMediaTransportParam(), true);
  }

}
