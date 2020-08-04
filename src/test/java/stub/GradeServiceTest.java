package stub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */


    @Mock
    private GradeSystem gradeSystem = mock(GradeSystem.class);

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        Mockito.when(gradeSystem.gradesFor(1001)).thenReturn(Arrays.asList(90.0, 80.0, 100.0));
        GradeService gradeService = new GradeService(gradeSystem);
        double avrage_grade = gradeService.calculateAverageGrades(1001);
        assertEquals(90.0,avrage_grade);

    }
}
