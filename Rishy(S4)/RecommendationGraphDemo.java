public class RecommendationGraphDemo {
    public static void main(String[] args) {
        RecommendationGraph graph = new RecommendationGraph();

        //Menambahkan node sesuai sample test run
        graph.addNode("Laskar Pelangi"); 
        graph.addNode("Negeri 5 Menara"); 
        graph.addNode("Ayat-Ayat Cinta"); 
        graph.addNode("Bumi Manusia");
        
        //Menambahkan relasi belanja bersama (Edge)
        graph.addEdge("Laskar Pelangi",  "Negeri 5 Menara"); 
        graph.addEdge("Laskar Pelangi",  "Ayat-Ayat Cinta"); 
        graph.addEdge("Negeri 5 Menara", "Bumi Manusia");
        
        //Menampilkan struktur graf
        graph.printGraph();
        System.out.println();

        //Menjalankan pencarian rekomendasi BFS
        graph.BFS("Laskar Pelangi");
        System.out.println();

        //Mengecek kerethubungan antar buku
        boolean hasPath = graph.hasPath("Laskar Pelangi", "Bumi Manusia");
        System.out.println("Koneksi ke Bumi Manusia? " + hasPath);
    }
}
