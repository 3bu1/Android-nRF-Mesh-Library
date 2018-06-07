package no.nordicsemi.android.meshprovisioner.control;

import no.nordicsemi.android.meshprovisioner.opcodes.TransportLayerOpCodes;

public abstract class TransportControlMessage {

    private static final String TAG = TransportControlMessage.class.getSimpleName();

    public abstract TransportControlMessageState getState();

    public enum TransportControlMessageState {
        LOWER_TRANSPORT_BLOCK_ACKNOWLEDGEMENT(TransportLayerOpCodes.SAR_ACK_OPCODE);

        private int state;

        TransportControlMessageState(final int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }
    }
}
