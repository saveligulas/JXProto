package org.jxproto.server.frame;

public interface IFrame {
    byte[] getPayload();
    FrameHeader getHeader();
}
