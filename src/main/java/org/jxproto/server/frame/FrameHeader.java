package org.jxproto.server.frame;

public class FrameHeader {
    public static int SIZE = 8; // 8 bytes for future extensibility

    public static FrameHeader fromPayload(IFrame frame) {
        byte[] content = new byte[8];
        System.arraycopy(frame.getPayload(), 0, content, 0, 8);
        return new FrameHeader(content);
    }

    private final byte[] content;

    public FrameHeader(byte[] content) {
        this.content = content;
    }
}
