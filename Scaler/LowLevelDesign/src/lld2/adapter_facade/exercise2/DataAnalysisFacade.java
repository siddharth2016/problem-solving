
import com.assignment.question.models.*;
import com.assignment.question.services.AnalysisAlgorithmService;
import com.assignment.question.services.DataCollectionService;
import com.assignment.question.services.DataPreprocessingService;
import com.assignment.question.services.VisualizationService;

public class DataAnalysisFacade {

    private DataCollectionService dataCollectionService;
    private DataPreprocessingService dataPreprocessingService;
    private AnalysisAlgorithmService analysisAlgorithmService;
    private VisualizationService visualizationService;

    public DataAnalysisFacade(DataCollectionService dataCollectionService,
                              DataPreprocessingService dataPreprocessingService,
                              AnalysisAlgorithmService analysisAlgorithmService,
                              VisualizationService visualizationService) {
        this.dataCollectionService = dataCollectionService;
        this.dataPreprocessingService = dataPreprocessingService;
        this.analysisAlgorithmService = analysisAlgorithmService;
        this.visualizationService = visualizationService;
    }

    public AnalysisResult facadeService(DataCollectionParams collectionParams,
                                        PreprocessingOptions preprocessingOptions,
                                        AnalysisAlgorithmConfig algorithmConfig) {
        // Step 1: Collect data
        DataCollectionResult collectionResult = dataCollectionService.collectData(collectionParams);

        // Step 2: Preprocess data
        PreprocessedData preprocessedData = dataPreprocessingService.preprocessData(collectionResult.getData(), preprocessingOptions);

        // Step 3: Apply analysis algorithms
        AnalysisResult analysisResult = analysisAlgorithmService.applyAnalysisAlgorithms(preprocessedData, algorithmConfig);

        // Step 4: Visualize results
        visualizationService.visualizeResults(analysisResult);

        return analysisResult;
    }

}
