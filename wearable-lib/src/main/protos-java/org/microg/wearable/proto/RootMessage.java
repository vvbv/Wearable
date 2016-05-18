// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;

public final class RootMessage extends Message {

  public static final Boolean DEFAULT_HASASSET = false;

  @ProtoField(tag = 4)
  public final SetAsset setAsset;

  @ProtoField(tag = 5)
  public final AckAsset ackAsset;

  @ProtoField(tag = 6)
  public final FetchAsset fetchAsset;

  @ProtoField(tag = 7)
  public final Connect connect;

  @ProtoField(tag = 8)
  public final SyncStart syncStart;

  @ProtoField(tag = 9)
  public final SetDataItem setDataItem;

  @ProtoField(tag = 10)
  public final Request rpcRequest;

  @ProtoField(tag = 11)
  public final Heartbeat heartbeat;

  @ProtoField(tag = 12)
  public final FilePiece filePiece;

  @ProtoField(tag = 13, type = BOOL)
  public final Boolean hasAsset;

  @ProtoField(tag = 16)
  public final Request channelRequest;

  public RootMessage(SetAsset setAsset, AckAsset ackAsset, FetchAsset fetchAsset, Connect connect, SyncStart syncStart, SetDataItem setDataItem, Request rpcRequest, Heartbeat heartbeat, FilePiece filePiece, Boolean hasAsset, Request channelRequest) {
    this.setAsset = setAsset;
    this.ackAsset = ackAsset;
    this.fetchAsset = fetchAsset;
    this.connect = connect;
    this.syncStart = syncStart;
    this.setDataItem = setDataItem;
    this.rpcRequest = rpcRequest;
    this.heartbeat = heartbeat;
    this.filePiece = filePiece;
    this.hasAsset = hasAsset;
    this.channelRequest = channelRequest;
  }

  private RootMessage(Builder builder) {
    this(builder.setAsset, builder.ackAsset, builder.fetchAsset, builder.connect, builder.syncStart, builder.setDataItem, builder.rpcRequest, builder.heartbeat, builder.filePiece, builder.hasAsset, builder.channelRequest);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RootMessage)) return false;
    RootMessage o = (RootMessage) other;
    return equals(setAsset, o.setAsset)
        && equals(ackAsset, o.ackAsset)
        && equals(fetchAsset, o.fetchAsset)
        && equals(connect, o.connect)
        && equals(syncStart, o.syncStart)
        && equals(setDataItem, o.setDataItem)
        && equals(rpcRequest, o.rpcRequest)
        && equals(heartbeat, o.heartbeat)
        && equals(filePiece, o.filePiece)
        && equals(hasAsset, o.hasAsset)
        && equals(channelRequest, o.channelRequest);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = setAsset != null ? setAsset.hashCode() : 0;
      result = result * 37 + (ackAsset != null ? ackAsset.hashCode() : 0);
      result = result * 37 + (fetchAsset != null ? fetchAsset.hashCode() : 0);
      result = result * 37 + (connect != null ? connect.hashCode() : 0);
      result = result * 37 + (syncStart != null ? syncStart.hashCode() : 0);
      result = result * 37 + (setDataItem != null ? setDataItem.hashCode() : 0);
      result = result * 37 + (rpcRequest != null ? rpcRequest.hashCode() : 0);
      result = result * 37 + (heartbeat != null ? heartbeat.hashCode() : 0);
      result = result * 37 + (filePiece != null ? filePiece.hashCode() : 0);
      result = result * 37 + (hasAsset != null ? hasAsset.hashCode() : 0);
      result = result * 37 + (channelRequest != null ? channelRequest.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<RootMessage> {

    public SetAsset setAsset;
    public AckAsset ackAsset;
    public FetchAsset fetchAsset;
    public Connect connect;
    public SyncStart syncStart;
    public SetDataItem setDataItem;
    public Request rpcRequest;
    public Heartbeat heartbeat;
    public FilePiece filePiece;
    public Boolean hasAsset;
    public Request channelRequest;

    public Builder() {
    }

    public Builder(RootMessage message) {
      super(message);
      if (message == null) return;
      this.setAsset = message.setAsset;
      this.ackAsset = message.ackAsset;
      this.fetchAsset = message.fetchAsset;
      this.connect = message.connect;
      this.syncStart = message.syncStart;
      this.setDataItem = message.setDataItem;
      this.rpcRequest = message.rpcRequest;
      this.heartbeat = message.heartbeat;
      this.filePiece = message.filePiece;
      this.hasAsset = message.hasAsset;
      this.channelRequest = message.channelRequest;
    }

    public Builder setAsset(SetAsset setAsset) {
      this.setAsset = setAsset;
      return this;
    }

    public Builder ackAsset(AckAsset ackAsset) {
      this.ackAsset = ackAsset;
      return this;
    }

    public Builder fetchAsset(FetchAsset fetchAsset) {
      this.fetchAsset = fetchAsset;
      return this;
    }

    public Builder connect(Connect connect) {
      this.connect = connect;
      return this;
    }

    public Builder syncStart(SyncStart syncStart) {
      this.syncStart = syncStart;
      return this;
    }

    public Builder setDataItem(SetDataItem setDataItem) {
      this.setDataItem = setDataItem;
      return this;
    }

    public Builder rpcRequest(Request rpcRequest) {
      this.rpcRequest = rpcRequest;
      return this;
    }

    public Builder heartbeat(Heartbeat heartbeat) {
      this.heartbeat = heartbeat;
      return this;
    }

    public Builder filePiece(FilePiece filePiece) {
      this.filePiece = filePiece;
      return this;
    }

    public Builder hasAsset(Boolean hasAsset) {
      this.hasAsset = hasAsset;
      return this;
    }

    public Builder channelRequest(Request channelRequest) {
      this.channelRequest = channelRequest;
      return this;
    }

    @Override
    public RootMessage build() {
      return new RootMessage(this);
    }
  }
}
