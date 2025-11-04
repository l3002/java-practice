import javax.swing.tree.TreeNode;

public class CgptProblem2 {
  public static int maxDepth(TreeNode rootNode){
    if(rootNode.isLeaf()){
      return 1;
    }
    int maxdl = maxDepth(rootNode.getChildAt(0));
    int maxdr = maxDepth(rootNode.getChildAt(1));
    if(maxdl > maxdr){
      return maxdl + 1;
    }
    return maxdr + 1;
  }
  public static void main(String[] args) throws Exception{
  }
}

