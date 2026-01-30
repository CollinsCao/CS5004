import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the ElectricVehicle class.
 */
public class ElectricVehicleTest {

    /**
     * Tests that battery size is clamped to the maximum value.
     */
    @Test
    public void testBatterySizeClampingMax() {
        ElectricVehicle ev = new ElectricVehicle("Test EV", 200.0, 0.5, 3.0);
        assertEquals(150.0, ev.getBatterySize(), 0.0001);
    }

    /**
     * Tests that battery size is clamped to the minimum value.
     */
    @Test
    public void testBatterySizeClampingMin() {
        ElectricVehicle ev = new ElectricVehicle("Test EV", 5.0, 0.5, 3.0);
        assertEquals(10.0, ev.getBatterySize(), 0.0001);
    }

    /**
     * Tests that a null name is replaced with "unknown EV".
     */
    @Test
    public void testNullName() {
        ElectricVehicle ev = new ElectricVehicle(null, 50.0, 0.5, 3.0);
        assertEquals("unknown EV", ev.getName());
    }

    /**
     * Tests that an empty name is replaced with "unknown EV".
     */
    @Test
    public void testEmptyName() {
        ElectricVehicle ev = new ElectricVehicle("", 50.0, 0.5, 3.0);
        assertEquals("unknown EV", ev.getName());
    }

    /**
     * Tests that default efficiency is clamped to the maximum value.
     */
    @Test
    public void testDefaultEfficiencyClampingMax() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 0.5, 10.0);
        assertEquals(4.5, ev.getEfficiency(), 0.0001);
    }

    /**
     * Tests that default efficiency is clamped to the minimum value.
     */
    @Test
    public void testDefaultEfficiencyClampingMin() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 0.5, 0.1);
        assertEquals(0.5, ev.getEfficiency(), 0.0001);
    }

    /**
     * Tests that state of charge is clamped to the maximum value.
     */
    @Test
    public void testStateOfChargeClampingMax() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 2.0, 3.0);
        assertEquals(1.0, ev.getStateOfCharge(), 0.0001);
    }

    /**
     * Tests that state of charge is clamped to the minimum value.
     */
    @Test
    public void testStateOfChargeClampingMin() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 0.0, 3.0);
        assertEquals(0.15, ev.getStateOfCharge(), 0.0001);
    }

    /**
     * Tests the range calculation.
     */
    @Test
    public void testRangeCalculation() {
        ElectricVehicle ev = new ElectricVehicle("EV", 100.0, 0.5, 4.0);
        assertEquals(200.0, ev.range(), 0.0001);
    }

    /**
     * Tests efficiency at normal temperature (65F to 77F).
     */
    @Test
    public void testNormalTemperatureEfficiency() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 1.0, 4.0);
        ev.updateEfficiency(70.0);
        assertEquals(4.0, ev.getEfficiency(), 0.0001);
    }

    /**
     * Tests efficiency reduction at high temperature (>77F).
     */
    @Test
    public void testHighTemperatureEfficiency() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 1.0, 4.0);
        ev.updateEfficiency(90.0);
        assertEquals(3.4, ev.getEfficiency(), 0.0001); // 4.0 * 0.85
    }

    /**
     * Tests efficiency reduction at very low temperature (max 50% reduction).
     */
    @Test
    public void testLowTemperatureEfficiency() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 1.0, 4.0);
        ev.updateEfficiency(0.0);
        assertEquals(2.0, ev.getEfficiency(), 0.0001); // 50% of 4.0
    }

    /**
     * Tests setting state of charge using the setter with clamping.
     */
    @Test
    public void testSetStateOfChargeClamping() {
        ElectricVehicle ev = new ElectricVehicle("EV", 50.0, 0.5, 3.0);
        ev.setStateOfCharge(2.0);
        assertEquals(1.0, ev.getStateOfCharge(), 0.0001);
    }

    /**
     * Tests the toString format.
     */
    @Test
    public void testToStringFormat() {
        ElectricVehicle ev = new ElectricVehicle("EV", 100.0, 0.5, 4.0);
        String result = ev.toString();
        assertTrue(result.contains("EV"));
        assertTrue(result.contains("50.0%"));
        assertTrue(result.contains("200.0"));
    }
}