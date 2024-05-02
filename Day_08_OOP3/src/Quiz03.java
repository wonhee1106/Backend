import javax.sound.midi.*;
import java.util.Scanner;
// import org.jfugue.player.Player

public class Quiz03 {

    public static void main(String[] args) {
//    	Player palayer = new Player();
//    	player.play("C D E F G A B");
        try {
            // Sequencer 열기
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // 무한 루프로 도레미파솔라시 음계 연주
            while (true) {
                // Sequence 및 Track 생성
                Sequence sequence = new Sequence(Sequence.PPQ, 4);
                Track track = sequence.createTrack();

                // 사용자 입력을 받아 도레미파솔라시 음계 선택
                Scanner scanner = new Scanner(System.in);
                System.out.println("도레미파솔라시 음계를 선택하세요:");
                System.out.println("1: 도, 2: 레, 3: 미, 4: 파, 5: 솔, 6: 라, 7: 시");
                int choice = scanner.nextInt();
                if (choice < 1 || choice > 7) {
                     System.out.println("1 ~ 7까지 다시 선택해주세요");// 잘못된 입력을 받으면 
                }
                int[] notes = getNotesForChoice(choice); // 선택된 음계에 해당하는 MIDI 노트 배열 가져오기

                // 노트 추가
                for (int note : notes) {
                    MidiEvent noteOn = createNoteOnEvent(note);
                    MidiEvent noteOff = createNoteOffEvent(note);
                    track.add(noteOn);
                    track.add(noteOff);
                }

                // Sequence를 Sequencer에 설정하고 재생
                sequencer.setSequence(sequence);
                sequencer.start();

                // 재생이 끝날 때까지 대기
                while (sequencer.isRunning()) {
                    Thread.sleep(1000);
                }
            }

            // Sequencer 닫기
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 노트 ON 이벤트 생성
    public static MidiEvent createNoteOnEvent(int note) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_ON, 0, note, 100);
        return new MidiEvent(message, 0);
    }

    // 노트 OFF 이벤트 생성
    public static MidiEvent createNoteOffEvent(int note) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_OFF, 0, note, 0);
        return new MidiEvent(message, 3); // 노트가 일정한 길이로 재생되도록 3틱 뒤에 노트 OFF 이벤트가 발생하도록 설정
    }

    // 사용자 선택에 따라 도레미파솔라시 음계에 해당하는 MIDI 노트 배열 반환
    public static int[] getNotesForChoice(int choice) {
        switch (choice) {
            case 1: return new int[]{60}; // 도
            case 2: return new int[]{62}; // 레
            case 3: return new int[]{64}; // 미
            case 4: return new int[]{65}; // 파
            case 5: return new int[]{67}; // 솔
            case 6: return new int[]{69}; // 라
            case 7: return new int[]{71}; // 시
            default: return new int[0]; // 잘못된 선택일 경우 빈 배열 반환
        }
    }
}

// Email 전송 라이브러리 실용성 높음
