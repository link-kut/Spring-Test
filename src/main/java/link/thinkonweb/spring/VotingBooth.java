package link.thinkonweb.spring;

public class VotingBooth {

  VoteRecorder voteRecorder = null;
  
  public void setVoteRecorder(VoteRecorder recorder) {
      this.voteRecorder = recorder;
  }
  
  public void vote(Candidate candidate) {
      voteRecorder.record(candidate);
  }

}