public class LingkaranBridge extends BangunDatarBridge {
    public LingkaranBridge(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void gambar() {
        System.out.print("Lingkaran ");
        implementor.gambar();
    }
}
