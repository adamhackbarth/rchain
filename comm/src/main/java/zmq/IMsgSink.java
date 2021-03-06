package zmq;

public interface IMsgSink
{
    //  Delivers a message. Returns true if successful; false otherwise.
    //  The function takes ownership of the passed message.
    public int pushMsg(Msg msg);
}
