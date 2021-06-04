package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({ GrupaTest.class, GrupaTestCuFixture.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
//@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteUrgenteCategory.class, TesteNormaleCategory.class})
public class SuitaCustom {

}