package java.io;

import checkers.nonnull.quals.EnsuresNonNullIf;
import checkers.nonnull.quals.Nullable;


public class BufferedReader extends Reader {
  public BufferedReader(Reader a1, int a2) { throw new RuntimeException("skeleton method"); }
  public BufferedReader(Reader a1) { throw new RuntimeException("skeleton method"); }
  public int read() throws IOException { throw new RuntimeException("skeleton method"); }
  public int read(char[] a1, int a2, int a3) throws IOException { throw new RuntimeException("skeleton method"); }
  public @Nullable String readLine() throws IOException { throw new RuntimeException("skeleton method"); }
  public long skip(long a1) throws IOException { throw new RuntimeException("skeleton method"); }
  @EnsuresNonNullIf(expression="readLine()", result=true)
  public boolean ready() throws IOException { throw new RuntimeException("skeleton method"); }
  public boolean markSupported() { throw new RuntimeException("skeleton method"); }
  public void mark(int a1) throws IOException { throw new RuntimeException("skeleton method"); }
  public void reset() throws IOException { throw new RuntimeException("skeleton method"); }
  public void close() throws IOException { throw new RuntimeException("skeleton method"); }
}
