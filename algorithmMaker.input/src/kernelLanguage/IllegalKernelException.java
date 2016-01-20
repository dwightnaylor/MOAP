package kernelLanguage;

public class IllegalKernelException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public IllegalKernelException(String msg) {
		super(msg);
	}
}
