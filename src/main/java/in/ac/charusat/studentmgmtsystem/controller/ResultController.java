package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Result;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class ResultController {
    @Autowired
    ResultRepository resultRepository;

//    List<Result> results = new ArrayList<>(
//            Arrays.asList(
//                    new Result(1, 244, "95"),
//                    new Result(2, 258, "97"),
//                    new Result(3, 318, "92")
//            )
//    );

    @GetMapping("/listResults")
    public List<Result> getAllStudents() {
        return resultRepository.findAll();
    };


    // Get
    @GetMapping("/result/{id}")
    public Result getStudent(@PathVariable Integer id) {
        return resultRepository.findById(id).get();
    }

    // Delete
    @DeleteMapping("/result/{id}")
    public List<Result> deleteStudent(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }
    @PostMapping("/result")
    public List<Result> addStudent(@RequestBody Result results) {
        resultRepository.save(results);
        return resultRepository.findAll();
    }
}
