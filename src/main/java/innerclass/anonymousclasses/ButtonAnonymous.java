package innerclass.anonymousclasses;

import innerclass.localclasses.Button;

public class ButtonAnonymous {

    private String title;
    private OnClickListenerAnonymous onClickListener;

    public ButtonAnonymous(String title) {
        this.title = title;
    }

    public void setOnClickListenerAnonymous(OnClickListenerAnonymous onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClickAnonymous() {
        this.onClickListener.onClickAnonymous(this.title);
    }

    public interface OnClickListenerAnonymous {
        public void onClickAnonymous(String title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
