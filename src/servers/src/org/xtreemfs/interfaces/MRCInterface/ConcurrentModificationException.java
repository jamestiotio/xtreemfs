package org.xtreemfs.interfaces.MRCInterface;

import org.xtreemfs.*;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.utils.*;
import yidl.Marshaller;
import yidl.Struct;
import yidl.Unmarshaller;




public class ConcurrentModificationException extends org.xtreemfs.interfaces.utils.ONCRPCException
{
    public static final int TAG = 2009090459;
    
    public ConcurrentModificationException() {  }
    public ConcurrentModificationException( String stack_trace ) { this.stack_trace = stack_trace; }

    public String getStack_trace() { return stack_trace; }
    public void setStack_trace( String stack_trace ) { this.stack_trace = stack_trace; }

    // java.io.Serializable
    public static final long serialVersionUID = 2009090459;    

    // yidl.Object
    public int getTag() { return 2009090459; }
    public String getTypeName() { return "org::xtreemfs::interfaces::MRCInterface::ConcurrentModificationException"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += Integer.SIZE/8 + ( stack_trace != null ? ( ( stack_trace.getBytes().length % 4 == 0 ) ? stack_trace.getBytes().length : ( stack_trace.getBytes().length + 4 - stack_trace.getBytes().length % 4 ) ) : 0 );
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeString( "stack_trace", stack_trace );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        stack_trace = unmarshaller.readString( "stack_trace" );    
    }
        
    

    private String stack_trace;    

}

