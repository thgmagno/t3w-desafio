package io.t3w.desafio.views.Produto;

import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.*;
import io.t3w.desafio.components.T3WButton;
import io.t3w.desafio.components.T3WFormLayout;
import io.t3w.desafio.data.entity.Produto;
import io.t3w.desafio.services.ProdutoService;
import org.vaadin.firitin.components.grid.VGrid;
import org.vaadin.firitin.components.html.VDiv;
import org.vaadin.firitin.components.orderedlayout.VVerticalLayout;

@Route("produtos")
@PageTitle("Produtos")
@Menu(order = 2, title = "Produtos")
public class ProdutosView extends VVerticalLayout implements BeforeEnterObserver {

    private final VGrid<Produto> gridProdutos;

    public ProdutosView(final ProdutoService produtoService) {
        this.withFullWidth();
        this.withPadding(false);

        gridProdutos = new VGrid<>();
        gridProdutos.withThemeVariants(GridVariant.LUMO_NO_BORDER);
        gridProdutos.addColumn(Produto::getId).setHeader("ID");
        gridProdutos.addColumn(Produto::getDescricao).setHeader("Descrição");
        gridProdutos.addColumn(Produto::getValorUnitario).setHeader("Valor");

        final var btnAdicionar = new T3WButton("Adicionar").themeTertiaryInline().themeSmall().withClassName("grid-actions")
            .withClickListener(ev -> new ProdutoDialog(new Produto(), produtoService, consumerProduto -> {
                // TODO: Produto deve ser adicionado na base de dados e no `gridProdutos`
            }).open());

        gridProdutos.addColumn(new ComponentRenderer<>(produto -> {
            final var btnEditar = new T3WButton("Editar").themeTertiaryInline().themeSmall()
                .withClickListener(ev -> new ProdutoDialog(produto, produtoService, consumerProduto -> {
                    // TODO: Produto deve ser removido da base de dados e do `gridProdutos`
                }).open());

            final var btnRemover = new T3WButton("Excluir").themeTertiaryInline().themeError().themeSmall()
                .withClickListener(ev -> {
                    // TODO: Produto deve ser removido da base de dados e do `gridProdutos`
                });

            return new VDiv(btnEditar, btnRemover).withClassName("grid-actions");
        })).setHeader(btnAdicionar);

        final var options = new T3WFormLayout().withFullWidth();

        this.add(options, gridProdutos);
    }

    @Override
    public void beforeEnter(final BeforeEnterEvent beforeEnterEvent) {
         // TODO: deve buscar os produtos na base de dados e expor os dados no grid
        gridProdutos.setItems();
    }
}