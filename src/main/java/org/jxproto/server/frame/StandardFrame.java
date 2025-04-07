package org.jxproto.server.frame;

import java.awt.*;

public class StandardFrame implements IFrame {
    private final byte[] payload;

    public StandardFrame(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public byte[] getPayload() {
        return this.payload;
    }

    @Override
    public FrameHeader getHeader() {
        return FrameHeader.fromPayload(this);
    }
}

