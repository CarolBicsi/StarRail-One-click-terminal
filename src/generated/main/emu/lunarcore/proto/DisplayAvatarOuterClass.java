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

public final class DisplayAvatarOuterClass {
  /**
   * Protobuf type {@code DisplayAvatar}
   */
  public static final class DisplayAvatar extends ProtoMessage<DisplayAvatar> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 pos = 7;</code>
     */
    private int pos;

    /**
     * <code>optional uint32 avatar_id = 14;</code>
     */
    private int avatarId;

    private DisplayAvatar() {
    }

    /**
     * @return a new empty instance of {@code DisplayAvatar}
     */
    public static DisplayAvatar newInstance() {
      return new DisplayAvatar();
    }

    /**
     * <code>optional uint32 pos = 7;</code>
     * @return whether the pos field is set
     */
    public boolean hasPos() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 pos = 7;</code>
     * @return this
     */
    public DisplayAvatar clearPos() {
      bitField0_ &= ~0x00000001;
      pos = 0;
      return this;
    }

    /**
     * <code>optional uint32 pos = 7;</code>
     * @return the pos
     */
    public int getPos() {
      return pos;
    }

    /**
     * <code>optional uint32 pos = 7;</code>
     * @param value the pos to set
     * @return this
     */
    public DisplayAvatar setPos(final int value) {
      bitField0_ |= 0x00000001;
      pos = value;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 14;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 14;</code>
     * @return this
     */
    public DisplayAvatar clearAvatarId() {
      bitField0_ &= ~0x00000002;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 14;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 14;</code>
     * @param value the avatarId to set
     * @return this
     */
    public DisplayAvatar setAvatarId(final int value) {
      bitField0_ |= 0x00000002;
      avatarId = value;
      return this;
    }

    @Override
    public DisplayAvatar copyFrom(final DisplayAvatar other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        pos = other.pos;
        avatarId = other.avatarId;
      }
      return this;
    }

    @Override
    public DisplayAvatar mergeFrom(final DisplayAvatar other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPos()) {
        setPos(other.pos);
      }
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      return this;
    }

    @Override
    public DisplayAvatar clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      pos = 0;
      avatarId = 0;
      return this;
    }

    @Override
    public DisplayAvatar clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DisplayAvatar)) {
        return false;
      }
      DisplayAvatar other = (DisplayAvatar) o;
      return bitField0_ == other.bitField0_
        && (!hasPos() || pos == other.pos)
        && (!hasAvatarId() || avatarId == other.avatarId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(pos);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(avatarId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pos);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DisplayAvatar mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // pos
            pos = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.pos, pos);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      output.endObject();
    }

    @Override
    public DisplayAvatar mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 111188: {
            if (input.isAtField(FieldNames.pos)) {
              if (!input.trySkipNullValue()) {
                pos = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public DisplayAvatar clone() {
      return new DisplayAvatar().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DisplayAvatar parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DisplayAvatar(), data).checkInitialized();
    }

    public static DisplayAvatar parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatar(), input).checkInitialized();
    }

    public static DisplayAvatar parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatar(), input).checkInitialized();
    }

    /**
     * @return factory for creating DisplayAvatar messages
     */
    public static MessageFactory<DisplayAvatar> getFactory() {
      return DisplayAvatarFactory.INSTANCE;
    }

    private enum DisplayAvatarFactory implements MessageFactory<DisplayAvatar> {
      INSTANCE;

      @Override
      public DisplayAvatar create() {
        return DisplayAvatar.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName pos = FieldName.forField("pos");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");
    }
  }
}
