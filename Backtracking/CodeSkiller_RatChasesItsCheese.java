import java.util.*;

public class CodeSkiller_RatChasesItsCheese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}

		int[][] ans = new int[n][m];
		path(maze, 0, 0, ans);
		if (flag == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean flag = false;

	public static void path(char[][] maze, int cr, int cc, int[][] ans) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			Display(ans);
			flag = true;
			return;

		}

		if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;

		int [] r = {-1, 1, 0, 0};
		int [] c = {0, 0, -1, 1};
		for(int i = 0; i<c.length; i++){
			path(maze, cr + r[i], cc + c[i], ans);
		}
		// path(maze, cr - 1, cc, ans);
		// path(maze, cr + 1, cc, ans);
		// path(maze, cr, cc - 1, ans);
		// path(maze, cr, cc + 1, ans);
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}