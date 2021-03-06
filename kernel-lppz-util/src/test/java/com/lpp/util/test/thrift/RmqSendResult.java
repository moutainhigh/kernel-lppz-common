/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lpp.util.test.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-26")
public class RmqSendResult implements org.apache.thrift.TBase<RmqSendResult, RmqSendResult._Fields>, java.io.Serializable, Cloneable, Comparable<RmqSendResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RmqSendResult");

  private static final org.apache.thrift.protocol.TField MSG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("MsgId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUEUE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("QueueId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUEUE_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("QueueOffset", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_SEND_OK_FIELD_DESC = new org.apache.thrift.protocol.TField("IsSendOK", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField ERR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("ErrMsg", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RmqSendResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RmqSendResultTupleSchemeFactory();

  public java.lang.String MsgId; // required
  public java.lang.String QueueId; // required
  public java.lang.String QueueOffset; // required
  public boolean IsSendOK; // required
  public java.lang.String ErrMsg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MSG_ID((short)1, "MsgId"),
    QUEUE_ID((short)2, "QueueId"),
    QUEUE_OFFSET((short)3, "QueueOffset"),
    IS_SEND_OK((short)4, "IsSendOK"),
    ERR_MSG((short)5, "ErrMsg");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MSG_ID
          return MSG_ID;
        case 2: // QUEUE_ID
          return QUEUE_ID;
        case 3: // QUEUE_OFFSET
          return QUEUE_OFFSET;
        case 4: // IS_SEND_OK
          return IS_SEND_OK;
        case 5: // ERR_MSG
          return ERR_MSG;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISSENDOK_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MSG_ID, new org.apache.thrift.meta_data.FieldMetaData("MsgId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_ID, new org.apache.thrift.meta_data.FieldMetaData("QueueId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("QueueOffset", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_SEND_OK, new org.apache.thrift.meta_data.FieldMetaData("IsSendOK", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ERR_MSG, new org.apache.thrift.meta_data.FieldMetaData("ErrMsg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RmqSendResult.class, metaDataMap);
  }

  public RmqSendResult() {
  }

  public RmqSendResult(
    java.lang.String MsgId,
    java.lang.String QueueId,
    java.lang.String QueueOffset,
    boolean IsSendOK,
    java.lang.String ErrMsg)
  {
    this();
    this.MsgId = MsgId;
    this.QueueId = QueueId;
    this.QueueOffset = QueueOffset;
    this.IsSendOK = IsSendOK;
    setIsSendOKIsSet(true);
    this.ErrMsg = ErrMsg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RmqSendResult(RmqSendResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMsgId()) {
      this.MsgId = other.MsgId;
    }
    if (other.isSetQueueId()) {
      this.QueueId = other.QueueId;
    }
    if (other.isSetQueueOffset()) {
      this.QueueOffset = other.QueueOffset;
    }
    this.IsSendOK = other.IsSendOK;
    if (other.isSetErrMsg()) {
      this.ErrMsg = other.ErrMsg;
    }
  }

  public RmqSendResult deepCopy() {
    return new RmqSendResult(this);
  }

  @Override
  public void clear() {
    this.MsgId = null;
    this.QueueId = null;
    this.QueueOffset = null;
    setIsSendOKIsSet(false);
    this.IsSendOK = false;
    this.ErrMsg = null;
  }

  public java.lang.String getMsgId() {
    return this.MsgId;
  }

  public RmqSendResult setMsgId(java.lang.String MsgId) {
    this.MsgId = MsgId;
    return this;
  }

  public void unsetMsgId() {
    this.MsgId = null;
  }

  /** Returns true if field MsgId is set (has been assigned a value) and false otherwise */
  public boolean isSetMsgId() {
    return this.MsgId != null;
  }

  public void setMsgIdIsSet(boolean value) {
    if (!value) {
      this.MsgId = null;
    }
  }

  public java.lang.String getQueueId() {
    return this.QueueId;
  }

  public RmqSendResult setQueueId(java.lang.String QueueId) {
    this.QueueId = QueueId;
    return this;
  }

  public void unsetQueueId() {
    this.QueueId = null;
  }

  /** Returns true if field QueueId is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueId() {
    return this.QueueId != null;
  }

  public void setQueueIdIsSet(boolean value) {
    if (!value) {
      this.QueueId = null;
    }
  }

  public java.lang.String getQueueOffset() {
    return this.QueueOffset;
  }

  public RmqSendResult setQueueOffset(java.lang.String QueueOffset) {
    this.QueueOffset = QueueOffset;
    return this;
  }

  public void unsetQueueOffset() {
    this.QueueOffset = null;
  }

  /** Returns true if field QueueOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueOffset() {
    return this.QueueOffset != null;
  }

  public void setQueueOffsetIsSet(boolean value) {
    if (!value) {
      this.QueueOffset = null;
    }
  }

  public boolean isIsSendOK() {
    return this.IsSendOK;
  }

  public RmqSendResult setIsSendOK(boolean IsSendOK) {
    this.IsSendOK = IsSendOK;
    setIsSendOKIsSet(true);
    return this;
  }

  public void unsetIsSendOK() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISSENDOK_ISSET_ID);
  }

  /** Returns true if field IsSendOK is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSendOK() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISSENDOK_ISSET_ID);
  }

  public void setIsSendOKIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISSENDOK_ISSET_ID, value);
  }

  public java.lang.String getErrMsg() {
    return this.ErrMsg;
  }

  public RmqSendResult setErrMsg(java.lang.String ErrMsg) {
    this.ErrMsg = ErrMsg;
    return this;
  }

  public void unsetErrMsg() {
    this.ErrMsg = null;
  }

  /** Returns true if field ErrMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetErrMsg() {
    return this.ErrMsg != null;
  }

  public void setErrMsgIsSet(boolean value) {
    if (!value) {
      this.ErrMsg = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MSG_ID:
      if (value == null) {
        unsetMsgId();
      } else {
        setMsgId((java.lang.String)value);
      }
      break;

    case QUEUE_ID:
      if (value == null) {
        unsetQueueId();
      } else {
        setQueueId((java.lang.String)value);
      }
      break;

    case QUEUE_OFFSET:
      if (value == null) {
        unsetQueueOffset();
      } else {
        setQueueOffset((java.lang.String)value);
      }
      break;

    case IS_SEND_OK:
      if (value == null) {
        unsetIsSendOK();
      } else {
        setIsSendOK((java.lang.Boolean)value);
      }
      break;

    case ERR_MSG:
      if (value == null) {
        unsetErrMsg();
      } else {
        setErrMsg((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MSG_ID:
      return getMsgId();

    case QUEUE_ID:
      return getQueueId();

    case QUEUE_OFFSET:
      return getQueueOffset();

    case IS_SEND_OK:
      return isIsSendOK();

    case ERR_MSG:
      return getErrMsg();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MSG_ID:
      return isSetMsgId();
    case QUEUE_ID:
      return isSetQueueId();
    case QUEUE_OFFSET:
      return isSetQueueOffset();
    case IS_SEND_OK:
      return isSetIsSendOK();
    case ERR_MSG:
      return isSetErrMsg();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RmqSendResult)
      return this.equals((RmqSendResult)that);
    return false;
  }

  public boolean equals(RmqSendResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_MsgId = true && this.isSetMsgId();
    boolean that_present_MsgId = true && that.isSetMsgId();
    if (this_present_MsgId || that_present_MsgId) {
      if (!(this_present_MsgId && that_present_MsgId))
        return false;
      if (!this.MsgId.equals(that.MsgId))
        return false;
    }

    boolean this_present_QueueId = true && this.isSetQueueId();
    boolean that_present_QueueId = true && that.isSetQueueId();
    if (this_present_QueueId || that_present_QueueId) {
      if (!(this_present_QueueId && that_present_QueueId))
        return false;
      if (!this.QueueId.equals(that.QueueId))
        return false;
    }

    boolean this_present_QueueOffset = true && this.isSetQueueOffset();
    boolean that_present_QueueOffset = true && that.isSetQueueOffset();
    if (this_present_QueueOffset || that_present_QueueOffset) {
      if (!(this_present_QueueOffset && that_present_QueueOffset))
        return false;
      if (!this.QueueOffset.equals(that.QueueOffset))
        return false;
    }

    boolean this_present_IsSendOK = true;
    boolean that_present_IsSendOK = true;
    if (this_present_IsSendOK || that_present_IsSendOK) {
      if (!(this_present_IsSendOK && that_present_IsSendOK))
        return false;
      if (this.IsSendOK != that.IsSendOK)
        return false;
    }

    boolean this_present_ErrMsg = true && this.isSetErrMsg();
    boolean that_present_ErrMsg = true && that.isSetErrMsg();
    if (this_present_ErrMsg || that_present_ErrMsg) {
      if (!(this_present_ErrMsg && that_present_ErrMsg))
        return false;
      if (!this.ErrMsg.equals(that.ErrMsg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMsgId()) ? 131071 : 524287);
    if (isSetMsgId())
      hashCode = hashCode * 8191 + MsgId.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueueId()) ? 131071 : 524287);
    if (isSetQueueId())
      hashCode = hashCode * 8191 + QueueId.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueueOffset()) ? 131071 : 524287);
    if (isSetQueueOffset())
      hashCode = hashCode * 8191 + QueueOffset.hashCode();

    hashCode = hashCode * 8191 + ((IsSendOK) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetErrMsg()) ? 131071 : 524287);
    if (isSetErrMsg())
      hashCode = hashCode * 8191 + ErrMsg.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RmqSendResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMsgId()).compareTo(other.isSetMsgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsgId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.MsgId, other.MsgId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQueueId()).compareTo(other.isSetQueueId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.QueueId, other.QueueId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQueueOffset()).compareTo(other.isSetQueueOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.QueueOffset, other.QueueOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsSendOK()).compareTo(other.isSetIsSendOK());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSendOK()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsSendOK, other.IsSendOK);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrMsg()).compareTo(other.isSetErrMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ErrMsg, other.ErrMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RmqSendResult(");
    boolean first = true;

    sb.append("MsgId:");
    if (this.MsgId == null) {
      sb.append("null");
    } else {
      sb.append(this.MsgId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("QueueId:");
    if (this.QueueId == null) {
      sb.append("null");
    } else {
      sb.append(this.QueueId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("QueueOffset:");
    if (this.QueueOffset == null) {
      sb.append("null");
    } else {
      sb.append(this.QueueOffset);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("IsSendOK:");
    sb.append(this.IsSendOK);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ErrMsg:");
    if (this.ErrMsg == null) {
      sb.append("null");
    } else {
      sb.append(this.ErrMsg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RmqSendResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RmqSendResultStandardScheme getScheme() {
      return new RmqSendResultStandardScheme();
    }
  }

  private static class RmqSendResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<RmqSendResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RmqSendResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MSG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.MsgId = iprot.readString();
              struct.setMsgIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUEUE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.QueueId = iprot.readString();
              struct.setQueueIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUEUE_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.QueueOffset = iprot.readString();
              struct.setQueueOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_SEND_OK
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsSendOK = iprot.readBool();
              struct.setIsSendOKIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ErrMsg = iprot.readString();
              struct.setErrMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RmqSendResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.MsgId != null) {
        oprot.writeFieldBegin(MSG_ID_FIELD_DESC);
        oprot.writeString(struct.MsgId);
        oprot.writeFieldEnd();
      }
      if (struct.QueueId != null) {
        oprot.writeFieldBegin(QUEUE_ID_FIELD_DESC);
        oprot.writeString(struct.QueueId);
        oprot.writeFieldEnd();
      }
      if (struct.QueueOffset != null) {
        oprot.writeFieldBegin(QUEUE_OFFSET_FIELD_DESC);
        oprot.writeString(struct.QueueOffset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_SEND_OK_FIELD_DESC);
      oprot.writeBool(struct.IsSendOK);
      oprot.writeFieldEnd();
      if (struct.ErrMsg != null) {
        oprot.writeFieldBegin(ERR_MSG_FIELD_DESC);
        oprot.writeString(struct.ErrMsg);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RmqSendResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RmqSendResultTupleScheme getScheme() {
      return new RmqSendResultTupleScheme();
    }
  }

  private static class RmqSendResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<RmqSendResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RmqSendResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMsgId()) {
        optionals.set(0);
      }
      if (struct.isSetQueueId()) {
        optionals.set(1);
      }
      if (struct.isSetQueueOffset()) {
        optionals.set(2);
      }
      if (struct.isSetIsSendOK()) {
        optionals.set(3);
      }
      if (struct.isSetErrMsg()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMsgId()) {
        oprot.writeString(struct.MsgId);
      }
      if (struct.isSetQueueId()) {
        oprot.writeString(struct.QueueId);
      }
      if (struct.isSetQueueOffset()) {
        oprot.writeString(struct.QueueOffset);
      }
      if (struct.isSetIsSendOK()) {
        oprot.writeBool(struct.IsSendOK);
      }
      if (struct.isSetErrMsg()) {
        oprot.writeString(struct.ErrMsg);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RmqSendResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.MsgId = iprot.readString();
        struct.setMsgIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.QueueId = iprot.readString();
        struct.setQueueIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.QueueOffset = iprot.readString();
        struct.setQueueOffsetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.IsSendOK = iprot.readBool();
        struct.setIsSendOKIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ErrMsg = iprot.readString();
        struct.setErrMsgIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

