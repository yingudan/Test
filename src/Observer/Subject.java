package Observer;

/**
 * 建立目标
 */
public interface Subject {
	public void attach(Observer o);//观察操作
    public void detach(Observer o);
    public void notice();
}
