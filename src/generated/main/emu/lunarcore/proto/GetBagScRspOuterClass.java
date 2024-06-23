// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class GetBagScRspOuterClass {
  /**
   * Protobuf type {@code GetBagScRsp}
   */
  public static final class GetBagScRsp extends ProtoMessage<GetBagScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     */
    private final RepeatedMessage<EquipmentOuterClass.Equipment> equipmentList = RepeatedMessage.newEmptyInstance(EquipmentOuterClass.Equipment.getFactory());

    /**
     * <code>repeated .Material material_list = 2;</code>
     */
    private final RepeatedMessage<MaterialOuterClass.Material> materialList = RepeatedMessage.newEmptyInstance(MaterialOuterClass.Material.getFactory());

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     */
    private final RepeatedMessage<RelicOuterClass.Relic> relicList = RepeatedMessage.newEmptyInstance(RelicOuterClass.Relic.getFactory());

    private GetBagScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetBagScRsp}
     */
    public static GetBagScRsp newInstance() {
      return new GetBagScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetBagScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetBagScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     * @return whether the equipmentList field is set
     */
    public boolean hasEquipmentList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     * @return this
     */
    public GetBagScRsp clearEquipmentList() {
      bitField0_ &= ~0x00000002;
      equipmentList.clear();
      return this;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEquipmentList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EquipmentOuterClass.Equipment> getEquipmentList() {
      return equipmentList;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EquipmentOuterClass.Equipment> getMutableEquipmentList() {
      bitField0_ |= 0x00000002;
      return equipmentList;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     * @param value the equipmentList to add
     * @return this
     */
    public GetBagScRsp addEquipmentList(final EquipmentOuterClass.Equipment value) {
      bitField0_ |= 0x00000002;
      equipmentList.add(value);
      return this;
    }

    /**
     * <code>repeated .Equipment equipment_list = 1;</code>
     * @param values the equipmentList to add
     * @return this
     */
    public GetBagScRsp addAllEquipmentList(final EquipmentOuterClass.Equipment... values) {
      bitField0_ |= 0x00000002;
      equipmentList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     * @return whether the materialList field is set
     */
    public boolean hasMaterialList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     * @return this
     */
    public GetBagScRsp clearMaterialList() {
      bitField0_ &= ~0x00000004;
      materialList.clear();
      return this;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMaterialList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MaterialOuterClass.Material> getMaterialList() {
      return materialList;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MaterialOuterClass.Material> getMutableMaterialList() {
      bitField0_ |= 0x00000004;
      return materialList;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     * @param value the materialList to add
     * @return this
     */
    public GetBagScRsp addMaterialList(final MaterialOuterClass.Material value) {
      bitField0_ |= 0x00000004;
      materialList.add(value);
      return this;
    }

    /**
     * <code>repeated .Material material_list = 2;</code>
     * @param values the materialList to add
     * @return this
     */
    public GetBagScRsp addAllMaterialList(final MaterialOuterClass.Material... values) {
      bitField0_ |= 0x00000004;
      materialList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     * @return whether the relicList field is set
     */
    public boolean hasRelicList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     * @return this
     */
    public GetBagScRsp clearRelicList() {
      bitField0_ &= ~0x00000008;
      relicList.clear();
      return this;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRelicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RelicOuterClass.Relic> getRelicList() {
      return relicList;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RelicOuterClass.Relic> getMutableRelicList() {
      bitField0_ |= 0x00000008;
      return relicList;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     * @param value the relicList to add
     * @return this
     */
    public GetBagScRsp addRelicList(final RelicOuterClass.Relic value) {
      bitField0_ |= 0x00000008;
      relicList.add(value);
      return this;
    }

    /**
     * <code>repeated .Relic relic_list = 15;</code>
     * @param values the relicList to add
     * @return this
     */
    public GetBagScRsp addAllRelicList(final RelicOuterClass.Relic... values) {
      bitField0_ |= 0x00000008;
      relicList.addAll(values);
      return this;
    }

    @Override
    public GetBagScRsp copyFrom(final GetBagScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        equipmentList.copyFrom(other.equipmentList);
        materialList.copyFrom(other.materialList);
        relicList.copyFrom(other.relicList);
      }
      return this;
    }

    @Override
    public GetBagScRsp mergeFrom(final GetBagScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasEquipmentList()) {
        getMutableEquipmentList().addAll(other.equipmentList);
      }
      if (other.hasMaterialList()) {
        getMutableMaterialList().addAll(other.materialList);
      }
      if (other.hasRelicList()) {
        getMutableRelicList().addAll(other.relicList);
      }
      return this;
    }

    @Override
    public GetBagScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      equipmentList.clear();
      materialList.clear();
      relicList.clear();
      return this;
    }

    @Override
    public GetBagScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      equipmentList.clearQuick();
      materialList.clearQuick();
      relicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetBagScRsp)) {
        return false;
      }
      GetBagScRsp other = (GetBagScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasEquipmentList() || equipmentList.equals(other.equipmentList))
        && (!hasMaterialList() || materialList.equals(other.materialList))
        && (!hasRelicList() || relicList.equals(other.relicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < equipmentList.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(equipmentList.get(i));
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < materialList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(materialList.get(i));
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < relicList.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(relicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * equipmentList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(equipmentList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * materialList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(materialList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * relicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(relicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetBagScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // equipmentList
            tag = input.readRepeatedMessage(equipmentList, tag);
            bitField0_ |= 0x00000002;
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // materialList
            tag = input.readRepeatedMessage(materialList, tag);
            bitField0_ |= 0x00000004;
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // relicList
            tag = input.readRepeatedMessage(relicList, tag);
            bitField0_ |= 0x00000008;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.equipmentList, equipmentList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.materialList, materialList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.relicList, relicList);
      }
      output.endObject();
    }

    @Override
    public GetBagScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2007143244:
          case 2109525167: {
            if (input.isAtField(FieldNames.equipmentList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(equipmentList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2115854747:
          case -1149360970: {
            if (input.isAtField(FieldNames.materialList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(materialList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 204814001:
          case 2071893482: {
            if (input.isAtField(FieldNames.relicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(relicList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetBagScRsp clone() {
      return new GetBagScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetBagScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetBagScRsp(), data).checkInitialized();
    }

    public static GetBagScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBagScRsp(), input).checkInitialized();
    }

    public static GetBagScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBagScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetBagScRsp messages
     */
    public static MessageFactory<GetBagScRsp> getFactory() {
      return GetBagScRspFactory.INSTANCE;
    }

    private enum GetBagScRspFactory implements MessageFactory<GetBagScRsp> {
      INSTANCE;

      @Override
      public GetBagScRsp create() {
        return GetBagScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName equipmentList = FieldName.forField("equipmentList", "equipment_list");

      static final FieldName materialList = FieldName.forField("materialList", "material_list");

      static final FieldName relicList = FieldName.forField("relicList", "relic_list");
    }
  }
}