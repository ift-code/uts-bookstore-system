public class RecommendationGraph {
    // Kelas internal untuk merepresentasikan edge
    private static class AdjNode {
        String bookTitle;
        AdjNode next;

        AdjNode(String bookTitle) {
            this.bookTitle = bookTitle;
            this.next = null;
        }
    }

    // Kelas internal untuk menyimpan daftar Vertex
    private static class Vertex {
        String bookTitle;
        AdjNode head;

        Vertex(String bookTitle) {
            this.bookTitle = bookTitle;
            this.head = null;
        }
    }

    // Menggunakan array statis dengan manual resizing untuk menampung vertex
    private Vertex[] vertices;
    private int vertexCount;
    private static final int INITIAL_CAPACITY = 10;

    public RecommendationGraph() {
        vertices = new Vertex[INITIAL_CAPACITY];
        vertexCount = 0;
    }

    // Memperbesar kapasitas array jika penuh
    private void resize() {
        Vertex[] newVertices = new Vertex[vertices.length * 2];
        System.arraycopy(vertices, 0, newVertices, 0, vertices.length);
        vertices = newVertices;
    }

    // Menemukan index dari judul buku di dalam array vertex
    private int findVertexIndex(String title) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].bookTitle.equals(title)) {
                return i;
            }
        }
        return -1;
    }

    // 1. Operasi addNode()
    public void addNode(String bookTitle) {
        if (findVertexIndex(bookTitle) != -1) {
            return; 
        }
        if (vertexCount == vertices.length) {
            resize();
        }
        vertices[vertexCount] = new Vertex(bookTitle);
        vertexCount++;
    }

    // 2. Operasi addEdge()
    public void addEdge(String source, String destination) {
        int sourceIdx = findVertexIndex(source);
        int destIdx = findVertexIndex(destination);

        // Validasi jika node belum terdaftar
        if (sourceIdx == -1 || destIdx == -1) {
            return;
        }

        // Tambahkan ke adjacency list dari source
        AdjNode newNode = new AdjNode(destination);
        if (vertices[sourceIdx].head == null) {
            vertices[sourceIdx].head = newNode;
        } else {
            // Hindari duplikat relasi edge
            AdjNode current = vertices[sourceIdx].head;
            while (current.next != null) {
                if (current.bookTitle.equals(destination)) return;
                current = current.next;
            }
            if (current.bookTitle.equals(destination)) return;
            current.next = newNode;
        }
    }

    // 3. Operasi printGraph()
    public void printGraph() {
        System.out.println("=== Graf Rekomendasi Buku ===");
        for (int i = 0; i < vertexCount; i++) {
            System.out.printf("%-18s -> [", vertices[i].bookTitle);

            AdjNode current = vertices[i].head;
            while (current != null) {
                System.out.print(current.bookTitle);
                current = current.next;
                if (current != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // 4. Operasi hasPath(from, to)
    public boolean hasPath(String from, String to) {
        int startIdx = findVertexIndex(from);
        if (startIdx == -1 || findVertexIndex(to) == -1) {
            return false;
        }

        // Melakukan pengecekan BFS sederhana untuk mencari jalur
        String[] queue = new String[vertexCount];
        String[] visited = new String[vertexCount];
        int head = 0, tail = 0;
        int visitedCount = 0;

        queue[tail++] = from;
        visited[visitedCount++] = from;

        while (head < tail) {
            String currentTitle = queue[head++];
            if (currentTitle.equals(to)) {
                return true;
            }

            int currIdx = findVertexIndex(currentTitle);
            if (currIdx != -1) {
                AdjNode adj = vertices[currIdx].head;
                while (adj != null) {
                    boolean isVisited = false;
                    for (int i = 0; i < visitedCount; i++) {
                        if (visited[i].equals(adj.bookTitle)) {
                            isVisited = true;
                            break;
                        }
                    }
                    if (!isVisited) {
                        visited[visitedCount++] = adj.bookTitle;
                        queue[tail++] = adj.bookTitle;
                    }
                    adj = adj.next;
                }
            }
        }
        return false;
    }

    // 5. Operasi BFS()
    public void BFS(String startTitle) {
        System.out.println("=== BFS Rekomendasi dari " + startTitle + " ===");
        int startIdx = findVertexIndex(startTitle);
        if (startIdx == -1) {
            System.out.println("Buku tidak ditemukan di dalam graf.");
            return;
        }

        // Struktur Queue dan Visited internal berbasis Array manual
        String[] queue = new String[vertexCount];
        String[] visited = new String[vertexCount];
        int head = 0, tail = 0;
        int visitedCount = 0;

        // Inisialisasi awal
        queue[tail++] = startTitle;
        visited[visitedCount++] = startTitle;

        while (head < tail) {
            String currentTitle = queue[head++];
            System.out.println("Kunjungi: " + currentTitle);

            int currIdx = findVertexIndex(currentTitle);
            if (currIdx != -1) {
                AdjNode adj = vertices[currIdx].head;
                while (adj != null) {
                    boolean isVisited = false;
                    for (int i = 0; i < visitedCount; i++) {
                        if (visited[i].equals(adj.bookTitle)) {
                            isVisited = true;
                            break;
                        }
                    }

                    if (!isVisited) {
                        visited[visitedCount++] = adj.bookTitle;
                        queue[tail++] = adj.bookTitle;
                    }
                    adj = adj.next;
                }
            }
        }
    } 
}