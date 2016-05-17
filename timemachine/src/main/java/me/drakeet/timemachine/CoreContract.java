package me.drakeet.timemachine;

import java.util.List;

/**
 * @author drakeet
 */
public interface CoreContract {

    // @formatter:off

    interface View {

        void setDelegate(Delegate delegate);
        void onNewIn(Message message);
    }


    interface Delegate {

        List<Message> provideInitialMessages();
        void onNewOut(Message message);
        void onMessageClick(Message message);
        void onMessageLongClick(Message message);
        boolean onLeftActionClick();
        boolean onRightActionClick();
    }


    interface Service {
        // pass
    }
}
