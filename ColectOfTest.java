import java.util.ArrayList;
import java.util.List;

public class ColectOfTest {
    List<PieceOfTest> totalTests = new ArrayList();


    void addTest(){
        // ітератором захєрячити всю діч
        //
        //  там не get а шось інше має бути... треба зберегти дані кудась
        totalTests.get(0).addQuestion();
        totalTests.get(0).addAnswer();
    }
}
