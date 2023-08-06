public class Main {
    public static void main(String[] args) {
        Implementor garisImplementor = new Garis();
        Implementor warnaImplementor = new Warna();

        BangunDatarBridge lingkaranBridgeGaris = new LingkaranBridge(garisImplementor);
        BangunDatarBridge persegiBridgeWarna = new PersegiBridge(warnaImplementor);

        lingkaranBridgeGaris.gambar();
        persegiBridgeWarna.gambar();
    }
}
