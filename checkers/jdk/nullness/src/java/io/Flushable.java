package java.io;

import checkers.nonnull.quals.Nullable;


public abstract interface Flushable{
  public abstract void flush() throws IOException;
}
