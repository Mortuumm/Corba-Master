package sysdist;

/**
* sysdist/HelloHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sysdist.idl
* lundi, 12. novembre 2018 21.46. h WET
*/

public final class HelloHolder implements org.omg.CORBA.portable.Streamable
{
  public sysdist.Hello value = null;

  public HelloHolder ()
  {
  }

  public HelloHolder (sysdist.Hello initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sysdist.HelloHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sysdist.HelloHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sysdist.HelloHelper.type ();
  }

}