package kernelLanguage;

//TODO: The validation should be more carefully done to ensure consistency with some measure of canonicalization.
public class DirtyKernelException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DirtyKernelException(String msg) {
		super(msg);
	}
}
