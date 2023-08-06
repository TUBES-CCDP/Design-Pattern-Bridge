public class PersegiBridge extends BangunDatarBridge {
    public PersegiBridge(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void gambar() {
        System.out.print("Persegi ");
        implementor.gambar();
    }
}
