package link.thinkonweb.spring;

import java.util.HashMap;
import java.util.Map;


public class LocalVoteRecorder implements VoteRecorder {

  Map hVotes = new HashMap();
  
  public void record(Candidate candidate) {
      int count = 0;
      
      if (!hVotes.containsKey(candidate)){
          hVotes.put(candidate, count);
      } else {
          count = (Integer)hVotes.get(candidate);
      }
      
      count++;
      
      hVotes.put(candidate, count);
  }
  
}
