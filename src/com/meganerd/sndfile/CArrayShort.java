/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.meganerd.sndfile;

public class CArrayShort {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CArrayShort(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CArrayShort obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsndfileJNI.delete_CArrayShort(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CArrayShort(int nelements) {
    this(libsndfileJNI.new_CArrayShort(nelements), true);
  }

  public short getitem(int index) {
    return libsndfileJNI.CArrayShort_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, short value) {
    libsndfileJNI.CArrayShort_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_short cast() {
    long cPtr = libsndfileJNI.CArrayShort_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_short(cPtr, false);
  }

  public static CArrayShort frompointer(SWIGTYPE_p_short t) {
    long cPtr = libsndfileJNI.CArrayShort_frompointer(SWIGTYPE_p_short.getCPtr(t));
    return (cPtr == 0) ? null : new CArrayShort(cPtr, false);
  }

}
