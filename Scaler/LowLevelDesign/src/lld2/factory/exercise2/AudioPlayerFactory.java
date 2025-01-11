
public class AudioPlayerFactory {

    public static AudioPlayer createAudioPlayer(MediaFormat format, int volume, double playBackRate) {
        switch(format) {
            case MP3: return new MP3Player(volume, playBackRate);
            case FLAC: return new FLACPlayer(volume, playBackRate);
            case WAV: return new WAVPlayer(volume, playBackRate);
            default: return null;
        }
    }

}