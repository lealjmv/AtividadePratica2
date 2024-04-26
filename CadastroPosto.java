import java.util.ArrayList;
import java.util.List;

public class CadastroPosto {
    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public static Veiculo buscarVeiculo(String marca, String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equals(marca) && veiculo.getModelo().equals(modelo)) {
                return veiculo;
            }
        }
        return null;
    }

    public static boolean excluirVeiculo(String marca, String modelo) {
        Veiculo veiculo = buscarVeiculo(marca, modelo);
        if (veiculo != null) {
            veiculos.remove(veiculo);
            return true;
        }
        return false;
    }

    public static List<Veiculo> listarTodosVeiculos() {
        return veiculos;
    }

    public static void excluirTodosVeiculos() {
        veiculos.clear();
    }
}
