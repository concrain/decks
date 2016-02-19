/*
	Dynamic connectivity
*/


class UnionFind {

	public static void main(String[] args) {
		println 'Main works'
	}

	/* Initialize Unionfind datastructure with N objects (0 to N-1) */
	UnionFind(int N) {}

    /* add connection between p and q */
	private void union(int p, int q) {  }

	/* are p and q in the same component? */
	private boolean connected(int p, int q) {  }

	/* component identifier for p (0 to N-1) */
	int find(int p) {}

	/* number of components */
	int count() {}

}

class TestUnionFind {

	private TestUnionFind() {
		def stdIn = new File('unionTest.txt')
		stdIn.eachLine { line, index -> 

			int N
			if (index == 1) {
				N = line.toInteger()
				println N
			}
			UnionFind uf = new UnionFind(N)

			if (index > 1) {
				int p = line[0].toInteger()
				int q = line[2].toInteger()

				if (!uf.connected(p, q)) {
					uf.union(p, q)
					println("${p} ${q}")
				}
			}
		}
	}
	
}
TestUnionFind ts = new TestUnionFind()

